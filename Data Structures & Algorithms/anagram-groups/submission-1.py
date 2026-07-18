class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        map1 = defaultdict(list)

        for i in strs:
            alpha = [0]*26

            for j in i:
                alpha[ord(j)-ord('a')]+=1
            map1[tuple(alpha)].append(i)

        return list(map1.values())

        